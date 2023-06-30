package PRACTIC6;

public class Notebook{
private String brand;
private int ram;
private int hdd;
private String os;
private String color;
private int diagonal;

public Notebook(String brand, int ram, int hdd, String os, String color,int diagonal) {
    this.brand = brand;
    this.ram = ram;
    this.hdd = hdd;
    this.os = os;
    this.color = color;
    this.diagonal = diagonal;

}

public String[] getParametrs() {
    String[] parametrsNotebook = new String[6];
    parametrsNotebook[0] = brand;
    parametrsNotebook[1] = String.valueOf(ram);
    parametrsNotebook[2] = String.valueOf(hdd);
    parametrsNotebook[3] = os;
    parametrsNotebook[4] = color;
    parametrsNotebook[5] = String.valueOf(diagonal);

    return parametrsNotebook;
}

public String[] inputParametrs() {
    String[] inputParametrs = new String[5];
    inputParametrs[0] = "Введите объем оперативной памяти в гигабайтах 4, 6, 8, 16. Объем равен =  ";
    inputParametrs[1] = "Введите объем жесткого диска в гигабайтах 128, 256, 512. Объем равен =  ";
    inputParametrs[2] = "Введите операционную систему 'w'-Windows 'l'-Linux 'm'-MacOs";
    inputParametrs[3] = "Введите цвет 'w'-белый 'b'-черный ";
    inputParametrs[4] = "Введите размер диагонали в дюймах 12, 14, 15, 16. Диагональ = ";

    return inputParametrs;
}


@Override
    public String toString() {
    // TODO Auto-generated method stub
    return String.format("Notebook: {brand = %s, ram = %s, hdd = %s, os = %s, color = %s, diagonal = %s",
            brand, ram, hdd, os, color, diagonal);
}


}