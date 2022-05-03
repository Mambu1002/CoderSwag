package com.mamburuapps.coderswag.Services

import com.mamburuapps.coderswag.model.Category
import com.mamburuapps.coderswag.model.Product

object DaraService {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL","digitalgoodsimage")

    )

    val hats = listOf(
        Product("Devslopes Graphic bini", "18$", "hat1"),
        Product("Devslopes Hat Black", "20$", "hat2"),
        Product("Devslopes Hat White", "22$", "hat3"),
        Product("Devslopes Hat Snapback", "17$", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "18$", "hoodie1"),
        Product("Devslopes Hoodie Red", "18$", "hoodie2"),
        Product("Devslopes Hoodie Bluse", "18$", "hoodie3"),
        Product("Devslopes Hoodie Black", "18$", "hoodie4")

    )

    val shirts = listOf(
        Product("Devslopes Shirt Gray", "12$", "shirt1"),
        Product("Devslopes Shirt  Red", "14$", "shirt2"),
        Product("Devslopes Shirt  Blue", "15$", "shirt3"),
        Product("Devslopes Shirt  Black", "19$", "shirt4"),
        Product("Devslopes Shirt  BlackRed", "19$", "shirt5"),

    )

    val digitalGoods = listOf<Product>()


    fun getProduct (category: String): List<Product> {
        return  when (category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }

    }

}