package com.lmy.pojo;

public class ResultTemplate {
	private ResultModel resultModel;
	private Object object;

	public ResultModel getResultModel() {
		return resultModel;
	}

	public void setResultModel(ResultModel resultModel) {
		this.resultModel = resultModel;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public ResultTemplate(ResultModel resultModel, Object object) {
		super();
		this.resultModel = resultModel;
		this.object = object;
	}

	public ResultTemplate() {
		super();
	}

	@Override
	public String toString() {
		return "ResultTemplate [resultModel=" + resultModel + ", object="
				+ object + "]";
	}
}
