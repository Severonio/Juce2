package Biblioteka;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reader {
    private final String name;
    private final int readerNumb;
    private Date receiptDt;
    private final String kurs;
    private final String catalogueStud;

    public Reader(String name, int readerNumb, String kurs, String catalogueStud) {
        this.name = name;
        this.readerNumb = readerNumb;
        this.receiptDt = null;
        this.kurs = kurs;
        this.catalogueStud = catalogueStud;
    }

    public Reader(String name, int readerNumb, String kurs, String catalogueStud, String date) throws ParseException{
        this(name, readerNumb, kurs, catalogueStud);
        this.receiptDt(date);

    }

    private void receiptDt(String date) throws ParseException {
        receiptDt = new SimpleDateFormat("dd.MM.yyyy").parse(date);
    }

    public String getName() {
        return name;
    }

    public int getReaderNumb() {
        return readerNumb;
    }

    public Date getReceiptDt() {
        return receiptDt;
    }

    public void setReceiptDt(Date receiptDt) {
        this.receiptDt = receiptDt;
    }

    public String getKurs() {
        return kurs;
    }

    public String getCatalogueStud() {
        return catalogueStud;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", readerNumb=" + readerNumb +
                ", receiptDt=" + receiptDt +
                ", kurs='" + kurs + '\'' +
                ", catalogueStud='" + catalogueStud + '\'' +
                '}';
    }

}
