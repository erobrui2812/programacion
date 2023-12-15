/**
 * 5. Modifica el horario añadiendo color
 *
 * @author Elías Robles
 */
public class T01Ejercicio05 {
    public static void main(String[] args) {
        //Dias de la semana
        System.out.printf("%-25s %-25s %-25s %-25s %-25s \n","Lunes","Martes","Miercoles","Jueves","Viernes");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        //Asignaturas
        System.out.printf("%-25s %-25s %-25s %-25s %-25s \n","\033[1;31mFOL","\033[1;34mProgramacion","\033[1;36mEntornos","\033[1;37mBases de datos","\033[1;34mProgramacion");
        System.out.printf("%-25s %-25s %-25s %-25s %-25s \n","\033[1;31mFOL","\033[1;34mProgramacion","\033[1;36mEntornos","\033[1;37mBases de datos","\033[1;34mProgramacion");
        System.out.printf("%-25s %-25s %-25s %-25s %-25s \n","\033[1;31mFOL","\033[1;37mBases de datos","\033[1;37mBases de datos","\033[1;33mLenguaje de marcas","\033[1;36mEntornos");
        System.out.printf("%-25s %-25s %-25s %-25s %-25s \n","\033[1;32mSistemas","\033[1;37mBases de datos","\033[1;37mBases de datos","\033[1;33mLenguaje de marcas","\033[1;32mSistemas");
        System.out.printf("%-25s %-25s %-25s %-25s %-25s \n","\033[1;32mSistemas","\033[1;33mLenguaje de marcas","\033[1;34mProgramacion","\033[1;34mProgramacion","\033[1;32mSistemas");
        System.out.printf("%-25s %-25s %-25s %-25s %-25s \n","\033[1;32mSistemas","\033[1;33mLenguaje de marcas","\033[1;34mProgramacion","\033[1;34mProgramacion","\033[1;32mSistemas");
    }
}