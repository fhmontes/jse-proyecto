package com.educomser.test;

import com.educomser.dao.ProductoDao;
import com.educomser.dao.impl.ProductoDaoImpl;
import com.educomser.domain.Producto;
import java.util.Scanner;

public class TestProductoEliminar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ProductoDao pdao = new ProductoDaoImpl();
        System.out.println("Ingreser id del producto a eliminar: ");
        Producto prod = pdao.findById(in.nextInt());
        if (prod == null) {
            System.out.println("No se encuentra el id del producto");
            System.exit(0);
        }
        pdao.delete(prod.getId());
        System.out.println("Producto eliminado correctamente");
    }

}
