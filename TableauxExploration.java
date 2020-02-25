class TableauxExploration {

    public static void initTen(int[][] tab){
        for(int i = 0; i < tab.length; i++ )
            for( int j = 0; j < tab[0].length; j++ )
                tab[i][j] = 10;
    }

    public static void initDiagonaleTen(int[][] tab) {
        if (tab.length == tab[0].length) {
            for (int i = 0; i < tab.length; i++)
                for (int j = 0; j < tab[0].length; j++)
                    if (tab[i][i] == tab[j][j]) {
                        tab[i][i] = 10;
                        tab[j][j] = 10;
                    }
        }
    }

    public static void initPosition(String[][] tab){
        for (int i = 0; i < tab.length; i++)
            for (int j = 0; j < tab[0].length; j++)
                tab[i][j] = i + ":" + j;

    }

    public static boolean isTabCarre(int[][] tab){
        if (tab.length == tab[0].length)
            return true;
        else
            return false;
    }

    public static boolean isTabDimEgal(int[][] tab1, int[][] tab2){
        if ((tab1.length & tab1[0].length) == (tab2.length & tab2[0].length))
            return true;
        else
            return false;
    }

    public static int[][] getSommeMatrices(int[][] tab1, int[][] tab2) {
        int[][] tab3 = new int[tab1.length][tab1[0].length];
        if (isTabDimEgal(tab1, tab2)) {
            for (int i = 0; i < tab1.length; i++)
                for (int j = 0; j < tab1[0].length; j++)
                    tab3[i][j] = tab1[i][j] + tab2[i][j];

        }
        return tab3;
    }
}
