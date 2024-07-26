package rii.project.logkar_driver_mobile

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform