class TableauxExploration {

    public static void initTen(int[][] tab){
        for(int i = 0; i < tab.length; i++ )
            for( int j = 0; j < tab[0].length; j++ )
                tab[i][j] = 10;
    }

    public static void initDiagonaleTen(int[][] tab){
        for(int i = 0; i < tab.length; i++ )
            for( int j = 0; j < tab[0].length; j++ )
                if (tab[i][i] = tab[j][j]) = 10;
    }

    public static void initPosition(String[][] tab){
    }

    public static boolean isTabCarre(int[][] tab){
        return false;
    }

    public static boolean isTabDimEgal(int[][] tab1, int[][] tab2){
        return false;
    }

    public static int[][] getSommeMatrices(int[][] tab1, int[][] tab2){
        return tab1;
    }
}
