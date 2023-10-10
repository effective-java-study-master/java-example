package assignment.ch02.sub03;

public class Printer
{
    private static Printer INSTANCE;
    public enum Option { PRINT, SCAN, FAX }
    public Option selectOption;
    public String text;
    private Boolean useYn = false;

    private Printer() throws Exception {
        if (INSTANCE != null) {
            throw new Exception("어디 감히!!!");
        }
    }

    public static Printer getInstance() throws Exception {
        if(INSTANCE == null) {
            synchronized (Printer.class) {
                if(INSTANCE == null) {
                    INSTANCE = new Printer();
                }
            }
        }
        return INSTANCE;
    }

    private void changePrinterUsage() {
        useYn = !useYn;
    }

    public void setSelectOption(Option selectOption){
        this.selectOption = selectOption;
    }
    public void setText(String text){
        this.text = text;
    }

    public void execute() {
        if(!useYn){
            changePrinterUsage();
            System.out.println(selectOption.name() + " " + text);
            changePrinterUsage();
        }
    }
}
