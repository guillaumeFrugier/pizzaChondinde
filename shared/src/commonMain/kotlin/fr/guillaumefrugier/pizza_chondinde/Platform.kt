package fr.guillaumefrugier.pizza_chondinde

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform