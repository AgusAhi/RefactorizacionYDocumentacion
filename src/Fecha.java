class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean valida() {
        if (dia < 1 || dia > 31) {
            return false;
        } else if (mes < 1 || mes > 12) {
            return false;
        } else if (anio < 0) {
            return false;
        } else if (dia > diaMes()) {
            return false;
        } else {
            return true;
        }
    }

    private int diaMes() {
        int diasMes = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasMes = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = 30;
                break;
            case 2: // verificación de año bisiesto
                diasMes = diasMesBisiesto();
                break;
        }
        return diasMes;
    }

    private int diasMesBisiesto() {
        int diasMes;
        if ((anio % 400 == 0) || ((anio % 4 == 0) && (anio %
                100 != 0))) {
            diasMes = 29;
        } else {
            diasMes = 28;
        }
        return diasMes;
    }
}

