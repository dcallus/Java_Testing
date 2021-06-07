public class Printer {

    private int sheetsOfPaper;
    private int tonerAmount;

    public Printer(){
        this.sheetsOfPaper = 30;
        this.tonerAmount = 20;
    }

    public int getSheetCount() {
        return this.sheetsOfPaper;
    }

    private void removeSheets(int i){
        this.sheetsOfPaper -= i;
    }

    public void print(int i, int i1) {
        int total = i * i1;
        if (this.sheetsOfPaper >= total) {
            this.removeSheets(total);
            this.reduceToner(total);
        }
    }

    public int getTonerCount() {
        return this.tonerAmount;
    }

    private void reduceToner(int i){
        this.tonerAmount -= i;
    }

}
