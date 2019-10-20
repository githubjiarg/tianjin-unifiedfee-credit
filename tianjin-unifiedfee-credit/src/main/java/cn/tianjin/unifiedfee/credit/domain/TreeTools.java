package cn.tianjin.unifiedfee.credit.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 组装treeview的工具类
 * @author Administrator
 *
 */
public class TreeTools{
	
	
	public String id;
    public String pid;
    public String text;
	public List<TreeTools> nodes = new ArrayList<TreeTools>();
    
	
	@Override
	public String toString() {
		return "TreeDemo [id=" + id + ", pid=" + pid + ", text=" + text + ", nodes=" + nodes + "]";
	}

	public TreeTools() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TreeTools(String id,String pid, String text, List<TreeTools> nodes) {
		super();
		this.id = id;
		this.pid = pid;
		this.text = text;
		this.nodes = nodes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<TreeTools> getNodes() {
		return nodes;
	}

	public void setNodes(List<TreeTools> nodes) {
		this.nodes = nodes;
	}

}
