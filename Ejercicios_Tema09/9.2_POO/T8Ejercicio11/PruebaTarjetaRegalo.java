/*
 * PruebaTarjetaRegalo.java
 * 
 * Copyright 2019 Javier <javier@javier-MRC-WX0>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class PruebaTarjetaRegalo {
	
  public static void main (String[] args) {
    TarjetaRegalo t1 = new TarjetaRegalo(100);
    TarjetaRegalo t2 = new TarjetaRegalo(120);
    
    System.out.println(t1);
    System.out.println(t2);
    
    t1.gasta(45.90);
    t2.gasta(5);
    t2.gasta(200);
    t1.gasta(3.55);
    
    System.out.println(t1);
    System.out.println(t2);
    
    TarjetaRegalo t3 = t1.fusionaCon(t2);
    
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
  }
}

