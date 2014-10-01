package builder;

public class BuilderClient {

	public static void main(String[] args) {
		QueryBuilderDirector director = new QueryBuilderDirector();
		String from = "from...";
		String where = "where";

		QueryBuilder qb = new SqlQueryBuilder();
		Query q = director.buildQuery(from, where, qb);
		q.execute();
		
		qb = new MongoQueryBuilder();
		q = director.buildQuery(from, where, qb);
		q.execute();
		
	}

}
