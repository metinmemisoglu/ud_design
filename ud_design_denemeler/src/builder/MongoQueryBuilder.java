package builder;

public class MongoQueryBuilder implements QueryBuilder{
	MongoQuery mq = new MongoQuery();
	@Override
	public void from(String from) {
		mq.setFrom(from);
	}

	@Override
	public void where(String where) {
		mq.setWhere(where);
	}

	@Override
	public Query getQuery() {
		return mq;
	}

}
