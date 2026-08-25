package Threads.FileUploadProcessor;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class FileUploadProcessor {
    private final ExecutorService executorService = Executors.newFixedThreadPool(3);

    private final Map<Integer, UploadStatus> uploadStatusMap = new ConcurrentHashMap<>();  //multiple worker threads can update the map concurrently and concurrentHashMap is thread safe(synchronized)

    private final AtomicInteger uploadIdGenerator = new AtomicInteger(1);


    public int submitFile(String fileName) {
        int uploadId = uploadIdGenerator.getAndIncrement();

        uploadStatusMap.put(uploadId, new UploadStatus("QUEUED", 0,fileName));

        CompletableFuture
                .runAsync(
                        () -> processFile(uploadId, fileName),
                        executorService
                )
                .thenRun(() -> {
                    System.out.println(
                            "Processing finished: " + uploadId
                    );
                })
                .exceptionally(exception -> {

                    System.out.println(
                            "Processing failed: " + uploadId
                    );

                    return null;
                });
        return uploadId;
    }

    private void processFile(int uploadId, String fileName) {
        try {
            uploadStatusMap.get(uploadId).setStatus("PROCESSING");
            for (int progress = 10; progress <= 100; progress += 10) {
                Thread.sleep(500);
                uploadStatusMap.get(uploadId).setProgress(progress);
                System.out.println(
                        fileName + " : " + progress + "%"
                );
            }
            uploadStatusMap.get(uploadId).setStatus("COMPLETED");
        } catch (Exception e) {
            uploadStatusMap.get(uploadId).setStatus("FAILED");
        }
    }
}
