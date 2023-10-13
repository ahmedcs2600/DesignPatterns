package behavioral.interpreter

fun main() {
    select("name,age") {
        from("users") {
            where("age > 25")
        }
    }
}

fun select(columns: String, from: SelectClause.() -> Unit): SelectClause {
    return SelectClause(columns).apply(from)
}

class SelectClause(private val columns: String) {
    private lateinit var from: FromClause
    fun from(
        table: String,
        where: FromClause.() -> Unit
    ): FromClause {
        from = FromClause(table)
        return from.apply(where)
    }
}

class FromClause(private val table: String) {
    private lateinit var where: WhereClause
    fun where(conditions: String) = apply { where = WhereClause(conditions) }
    override fun toString(): String ="FROM $table $where"
}

class WhereClause(private val conditions: String) {
    override fun toString(): String = "WHERE $conditions"
}


