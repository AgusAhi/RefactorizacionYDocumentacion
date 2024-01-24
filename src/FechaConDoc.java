/**
 * //Clase que detecta si una fecha introducida como día, mes, año es correcta
 * @author Profesor
 * @version 4.5.1
 */
public class FechaConDoc {
    private final int dia;
    private final int mes;
    private final int anio;
    /**
     * Esta es el constructor de la clase Fecha
     * @param dia
     * @param mes
     * @param anio
     */
    public FechaConDoc(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
     * Función que valida la fecha si es correcta
     * @return true si la fecha es correcta y false si no lo es
     */
    public boolean valida() {
        if (dia < 1 || dia > 31) return false;
        if (mes < 1 || mes > 12) return false;
        if (anio < 0) return false;
        return dia <= diaMes();
    }
    /**
     * Función que devuelve el día máximo del mes introducido
     * @return diames
     */
    private int diaMes() {
        int diasMes = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: diasMes = 31; break;
            case 4:
            case 6:
            case 9:
            case 11 : diasMes = 30; break;
// verificación de año bisiesto
            case 2 : diasMes = bisiesto(); break;
        }
        return diasMes;
    }
    /**
     * Función que comprueba si el año es bisiesto
     * @return diames
     */
    private int bisiesto() {
        int diasMes;
        if ((anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0)))
            diasMes = 29;
        else
            diasMes = 28;
        return diasMes;
    }
}