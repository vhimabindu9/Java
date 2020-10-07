public class ReplaceAndReverse {

    //DN('A' & 'T'), ('C' & 'G') replace with each other and reverse the string with
    // input 'GTCAA' and output should be 'TTGAC'

    public static void main (String[]args){
        String dna = "GTCAA";
        String reversedna = new StringBuilder(dna).reverse().toString();

        System.out.println(reversedna);
        StringBuilder reverseCompliment = new StringBuilder();

        for (int i =0; i<reversedna.length();i++){
            char c = reversedna.charAt(i);
            if(reversedna.charAt(i) == 'A') {
                reverseCompliment.append('T');
            }
            if(reversedna.charAt(i)=='T') {
                reverseCompliment.append('A');
            }
            if(reversedna.charAt(i)=='C') {
                reverseCompliment.append('G');
            }
            if(reversedna.charAt(i)=='G') {
                reverseCompliment.append('C');
            }
            System.out.println(reverseCompliment.toString());
        }
    }
}
