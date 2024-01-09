package at.dichter.test;

public class AirPlay implements Device {
    private String Content = "";
    private boolean isActive = false;

    public AirPlay(String content) {
        Content = content;
    }

    @Override
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public boolean isActive() {
        return isActive;
    }

    @Override
    public String getContent() {
        return Content;
    }

}
