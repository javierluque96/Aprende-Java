public class Ejercicio4 {
	
	public static void main (String args[]) {

    System.out.println("Hora  |  Lunes  |  Martes  |  Miércoles  |  Jueves | Viernes  |");
    System.out.println("---------------------------------------------------------------");
    //1ª
    System.out.printf("%-4s  |   %-4s    |   %-4s    |     %-4s     |   %-4s   |   %-4s    |"
    , "8:15", "\033[32mED", "\033[31mPRO", "\033[31mPRO", "\033[31mPRO", "\033[36mFOL");
    //2ª
    System.out.printf("\n%-4s  |   %-4s    |   %-4s    |     %-4s     |   %-4s   |   %-4s    |"
    , "\033[37m9:15", "\033[33mLM", "\033[31mPRO", "\033[31mPRO", "\033[31mPRO", "\033[36mFOL");
    //3ª
    System.out.printf("\n%-5s |   %-4s    |   %-4s    |     %-4s      |   %-4s   |   %-4s    |"
    , "\033[37m10:15", "\033[33mLM", "\033[31mPRO", "\033[32mED", "\033[31mPRO", "\033[36mFOL");
    //DESCANSO
    System.out.printf("\n\033[37m%-5S |   D      E      S      C      A      N      S      O","11:15");    
    //4ª
    System.out.printf("\n%-5s |   %-4s  |   %-4s   |     %-4s      |   %-4s  |  %-4s    |"
    , "\033[37m11:45", "\033[34mSINF", "\033[35mBBDD", "\033[32mED", "\033[35mBBDD", "\033[34mSINF");
    //5ª
    System.out.printf("\n%-5s |   %-4s  |   %-4s   |     %-4s      |   %-4s  |  %-4s    |"
    , "\033[37m12:45", "\033[34mSINF", "\033[35mBBDD", "\033[33mLM", "\033[35mBBDD", "\033[34mSINF");
    //6ª
    System.out.printf("\n%-5s |   %-4s  |   %-4s   |     %-4s      |   %-4s  |  %-4s    |"
    , "\033[37m13:45", "\033[34mSINF", "\033[35mBBDD", "\033[33mLM", "\033[35mBBDD", "\033[34mSINF");
	}
}

