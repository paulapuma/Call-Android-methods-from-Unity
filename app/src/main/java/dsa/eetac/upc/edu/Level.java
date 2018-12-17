package dsa.eetac.upc.edu;

public class Level {

    public int level;

    public String getLevelData(int level) {
        String mapa="";
        if (level==1) {
            mapa =        "********\n" +
                          "*  M F *\n" +
                          "* SM   *\n" +
                          "*      *\n" +
                          "*  MS  *\n" +
                          "*    M *\n" +
                          "* F    *\n" +
                          "********\n";
        }
        if (level==2) {
            mapa =
                    "********\n" +
                    "* ME F *\n" +
                    "* SM   *\n" +
                    "* M    *\n" +
                    "*   SE *\n" +
                    "* M  M *\n" +
                    "* F    *\n" +
                    "********\n";
        }
        if (level==3) {
            mapa =
                            "********\n" +
                            "* EM F *\n" +
                            "* SME  *\n" +
                            "* FS    *\n" +
                            "*  MSE *\n" +
                            "* M  M *\n" +
                            "* F  S *\n" +
                            "********\n";
        }
        return mapa;
    }


    @Override
    public String toString() {
        return ("Level: " + level);
    }
}
