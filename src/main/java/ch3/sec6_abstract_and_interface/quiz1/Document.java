package ch3.sec6_abstract_and_interface.quiz1;

public class Document implements Printable {

    private String title;
    private String content;

    public Document(String title, String content) {}

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void print() {

    }
}
