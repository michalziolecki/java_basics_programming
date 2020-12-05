package java_ex_2_mz;

import presentation.Book;

/**
 * Created by Michal Ziolecki.
 */
public class Main9{

    public static void main(String[] args) {
        Book book = new Book();
        //zad3
        //Scanner scanner = new Scanner( System.in );
        Zad9 statisticsOfInPut = new Zad9();
        String inPutString = "Drogi Marszałku, Wysoka Izbo. PKB rośnie. Z pełną odpowiedzialnością mogę" +
                "stwierdzić iż realizacja określonych zadań stanowionych przez organizację. Dalszy" +
                "rozwój jest ważne zadanie w większym stopniu tworzenie odpowiednich warunków" +
                "aktywizacji. Często niezauważanym szczegółem jest to, że zakres i rozwijanie" +
                "struktur pociąga za najważniejszy punkt naszych działań obierzemy praktykę, nie zaś" +
                "teorię, okazuje się jasne.";

        //System.out.println("Write text: ");
        /*while(scanner.nextLine() != null)
        {
            inPutString = scanner.nextLine();
            statisticsOfInPut.getInput( inPutString );
            statisticsOfInPut.createStatistic();
        }*/
        //inPutString = scanner.nextLine();
        statisticsOfInPut.getInput( inPutString );
        statisticsOfInPut.createStatistic();

        //System.out.println(inPutString);
    }
}
