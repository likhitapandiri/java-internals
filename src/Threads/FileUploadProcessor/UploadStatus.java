package Threads.FileUploadProcessor;

public class UploadStatus {
private String status;
private int progress;
private String fileName;

    public UploadStatus(String status, int progress,String fileName) {
        this.status = status;
        this.progress = progress;
        this.fileName=fileName;
    }
    public String getStatus() {
        return status;
    }

    public int getProgress() {
        return progress;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
}
