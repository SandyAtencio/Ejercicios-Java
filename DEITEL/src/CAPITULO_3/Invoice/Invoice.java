package CAPITULO_3.Invoice;

public class Invoice {

    String pieceNumber;
    String pieceDescription;
    int    articleQuantity = 0;
    double priceForArticle;

    public Invoice(String pieceNumber, String pieceDescription, double priceForArticle){
        this.pieceNumber = pieceNumber;
        this.pieceDescription = pieceDescription;
        this.priceForArticle = priceForArticle;
    }

    public String getPieceNumber(){
        return pieceNumber;
    }

    public void setPieceNumber(String pieceNumber){
        this.pieceNumber = pieceNumber;
    }

    public String getPieceDescription() {
        return pieceDescription;
    }

    public void setPieceDescription(String pieceDescription) {
        this.pieceDescription = pieceDescription;
    }

    public int getArticleQuantity() {
        return articleQuantity;
    }

    public void setArticleQuantity(int articleQuantity) {
        this.articleQuantity = articleQuantity;
    }

    public double getPriceForArticle() {
        return priceForArticle;
    }

    public void setPriceForArticle(double priceForArticle) {
        this.priceForArticle = priceForArticle;
    }

    public double getInvoiceAmount(int articleQuantity){
        double amount = 0;

        if(articleQuantity <= 0 && priceForArticle <= 0){
            this.articleQuantity = 0;
            this.priceForArticle = 0;
        }else {
            amount = articleQuantity * priceForArticle;
        }
           return amount;

    }
}
