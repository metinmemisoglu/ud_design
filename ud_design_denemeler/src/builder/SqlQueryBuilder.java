package builder;

public class SqlQueryBuilder implements QueryBuilder{
	SqlQuery sql = new SqlQuery();

	@Override
	public void from(String from) {
		sql.setFrom(from);
	}

	@Override
	public void where(String where) {
		sql.setWhere(where);
	}

	@Override
	public Query getQuery() {
		return sql;
	}
	
	
	
}
