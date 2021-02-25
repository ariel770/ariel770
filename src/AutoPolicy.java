public class AutoPolicy {
    private String companyName ;
    private int model ;
    private boolean fullCover ;

    public AutoPolicy(String companyName , int model){
        this.companyName =companyName;
        this.model =model ;
    }

    public int getModel() {
        return model;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setFullCover(boolean fullCover) {
        this.fullCover = fullCover;
    }

    public boolean getFullCover() {
        switch(getModel()){
            case  2010 :
                this.fullCover = true;
                break;
            case 2020 :
                fullCover = false;
                break;
        }
     return fullCover ;
    }
}
