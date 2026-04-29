package oop_127511_vierza.week10.tugasMandiri

data class ApiResponse<T>(
    val status: String,
    val data: T
)