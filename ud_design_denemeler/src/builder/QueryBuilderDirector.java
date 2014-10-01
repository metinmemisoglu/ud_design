package builder;

public class QueryBuilderDirector {
	public Query buildQuery(String from,String where,QueryBuilder qb){
		qb.from(from);
		qb.where(where);
		return qb.getQuery();
	}
}
