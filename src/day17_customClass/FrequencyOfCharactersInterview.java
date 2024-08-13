package day17_customClass;

public class FrequencyOfCharactersInterview {

    public static void main(String[] args) {

        String str = "aabcccd";

        String result = ""; //a2b1c3d1
        // a b c d
        // 2  1 3 1

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // a karekteriyle baslacak kac kez gectigini tarayacak tüm kelime uzunlugunca ,kiyaslamak icin
            // bunn icin for loop olustrcak.parentezde ki sifir srekli degismesi gerekiyor.
            // eger bu islem srekli tekrarli olsn istersem baska bir loop ine almam lazim ve charAt j degeri verirsek, tek tek kendi tarar ve hesaplama ekler
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if(result.contains("" + ch)){
                continue;

            }
            result += ch +""+ count;
        }
        System.out.println(result); //a2b1c3d1
    }
}
