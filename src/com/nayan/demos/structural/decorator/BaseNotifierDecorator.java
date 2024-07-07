package com.nayan.demos.structural.decorator;

public abstract class BaseNotifierDecorator implements Notify{

	private final Notify wrapped;
	protected final MySQLService dbService;
	
	public BaseNotifierDecorator(Notify wrapped) {
		super();
		this.wrapped = wrapped;
		this.dbService = new MySQLService();
	}

	public Notify getWrapped() {
		return wrapped;
	}

	public MySQLService getDbService() {
		return dbService;
	}

	@Override
	public void send(String msg) {
		wrapped.send(msg);
	}

	@Override
	public String getUsername() {
		return wrapped.getUsername();
	}
}
