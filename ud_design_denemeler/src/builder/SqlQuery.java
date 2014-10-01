package builder;

public class SqlQuery implements Query{
	private String from;
	private String where;
	
	@Override
	public void execute() {
		System.out.println("Sql :"+from+"/"+where);
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	
	
}
