package vip.alphax.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.sf.json.JSONObject;

import java.io.Serializable;
import java.util.List;

/**
 * @Author bootdo 1992lcg@163.com
 */
public class  PageUtils implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long total;
	private List<?> rows;

	public PageUtils(List<?> list, Long total) {
		this.rows = list;
		this.total = total;
	}

	/**
	 * @author Alpha丶X 
	 * @date 2019-02-13 14:58:12
	 * @desc 通过bootstrapTable获取mybatis-plus的分页包装
	 */
	public static IPage getIPage(JSONObject data){
		long offset = data.optLong("offset");
		long limit = data.optLong("limit");
		long pages = offset / limit + 1;
		return new Page<>(pages, limit);
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
