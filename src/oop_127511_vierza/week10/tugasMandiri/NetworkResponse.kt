package oop_127511_vierza.week10.tugasMandiri

data class ApiResponse<T>(
    val statu: String,
    val data: T
)