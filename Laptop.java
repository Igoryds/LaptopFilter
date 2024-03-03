import java.util.Objects;

/**
 * Laptop
 */
public class Laptop {

    private String model;
    private String operatingSystem;
    private int year;
    private boolean gamingLaptop;
    private String color;
    private double diagonal;
    private String processor;
    private int volumeRAM;
    private int volumeSSD;
    private int weight;
    private int price;

    public Laptop(String model, String operatingSystem, int year, boolean gamingLaptop, String color, double diagonal, String processor, int volumeRAM, int volumeSSD, int weight, int price) {
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.year = year;
        this.gamingLaptop = gamingLaptop;
        this.color = color;
        this.diagonal = diagonal;
        this.processor = processor;
        this.volumeRAM = volumeRAM;
        this.volumeSSD = volumeSSD;
        this.weight = weight;
        this.price = price;
    }
    

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public boolean isGamingLaptop() {
        return gamingLaptop;
    }
    public void setGamingLaptop(boolean gamingLaptop) {
        this.gamingLaptop = gamingLaptop;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getDiagonal() {
        return diagonal;
    }
    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public int getVolumeRAM() {
        return volumeRAM;
    }
    public void setVolumeRAM(int volumeRAM) {
        this.volumeRAM = volumeRAM;
    }
    public int getVolumeSSD() {
        return volumeSSD;
    }
    public void setVolumeSSD(int volumeSSD) {
        this.volumeSSD = volumeSSD;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "название модели: " + model + ", Характеристики: операционная система: " + operatingSystem + 
        ", год выпуска: " + year + ", игоровой ноутбук: " + gamingLaptop + ", цвет: " + color + ", диагональ экрана = " + diagonal + 
        ", процессор: " + processor + ", объем ОЗУ = " + volumeRAM + ", объем жесткого диска = " + volumeSSD + 
        ", вес = " + weight + " грамм, стоимость: " + price + " рублей";
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Laptop laptop = (Laptop) obj;

        return laptop.model.equals(model) &&    //String model, String operatingSystem, int year, boolean gamingLaptop, String color, double diagonal, String processor, int volumeRAM, int volumeSSD, int weight, int price) {
                laptop.operatingSystem.equals(operatingSystem) &&
                laptop.year == year &&
                laptop.gamingLaptop == gamingLaptop &&
                laptop.color.equals(color) &&
                laptop.diagonal == diagonal &&
                laptop.processor.equals(processor) &&
                laptop.volumeRAM == volumeRAM &&
                laptop.volumeSSD == volumeSSD &&
                laptop.weight == weight &&
                laptop.price == price;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(model, operatingSystem, year, gamingLaptop, color, diagonal, processor, volumeRAM, volumeSSD, weight, price);
    }

}