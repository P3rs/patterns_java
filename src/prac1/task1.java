package prac1;

public class task1 {
    public static void main(String[] args){
        String[] array = {"asdsda", "sadad", "siauda", "qijdfvn", "sodjkw"};
        System.out.println("Initial array:");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("----------------------------------\nMirrored array:");
        Function<String[]> doing = new Function<String[]>() {
            @Override
            public String[] Mirror(String[] strings) {
                for (int i = 0; i < strings.length; i++){
                    strings[i] = new StringBuilder(strings[i]).reverse().toString();
                    System.out.println(strings[i]);
                }
                return strings;
            }
        };
        doing.Mirror(array);
    }
}
