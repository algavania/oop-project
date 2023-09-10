/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_6;

/**
 *
 * @author MSI
 */
public class Shape {

    public double length;
    public double width;
    public double height;
    public double volume;

    public Shape(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double compareTo(Shape shape) {
        calculateVolume();
        shape.calculateVolume();
        return shape.volume - this.volume;
    }

    private void calculateVolume() {
        this.volume = this.length * this.width * this.height;
    }

    public void cetak() {
        calculateVolume();
        System.out.println("Panjangxlebarxtinggi = " + this.length + "x" + this.width + "x" + this.height);
        System.out.println("Volume = " + this.volume);
    }
}
