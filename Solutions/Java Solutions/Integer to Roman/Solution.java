class Solution {
    public String intToRoman(int num) {

        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] numerals = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder stringbuild = new StringBuilder();
        
        for(int i=0;i<numerals.length;i++) {
            while(num >= numerals[i]) {
                num -= numerals[i];
                stringbuild.append(romans[i]);
            }
        }
        return stringbuild.toString();
    }
}