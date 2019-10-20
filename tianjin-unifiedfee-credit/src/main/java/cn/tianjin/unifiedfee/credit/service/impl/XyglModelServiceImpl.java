package cn.tianjin.unifiedfee.credit.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.taiji.db.jpa.base.service.BaseServiceImpl;
import cn.tianjin.unifiedfee.credit.domain.TreeTools;
import cn.tianjin.unifiedfee.credit.domain.XyglIndicators;
import cn.tianjin.unifiedfee.credit.domain.XyglModel;
import cn.tianjin.unifiedfee.credit.domain.XyglModeldetail;
import cn.tianjin.unifiedfee.credit.repository.XyglIndicatorsRepository;
import cn.tianjin.unifiedfee.credit.repository.XyglModelRepository;
import cn.tianjin.unifiedfee.credit.repository.XyglModeldetailRepository;
import cn.tianjin.unifiedfee.credit.service.XyglModelService;
import cn.tianjin.unifiedfee.credit.service.XyglModeldetailService;

@Service
public class XyglModelServiceImpl extends BaseServiceImpl<XyglModel, String> implements XyglModelService {
	@Autowired
	public XyglModelRepository xyglModelRepository;
	@Autowired
	public XyglIndicatorsRepository xyglIndicatorsRepository;
	@Autowired
	public XyglModeldetailRepository xyglModeldetailRepository;
	@Autowired
	public XyglModeldetailService xyglModeldetailService;
	
	@Override
	public List<TreeTools> getTree() {
		
		List<TreeTools> listTree = new ArrayList<>();
		List<XyglIndicators> list = xyglIndicatorsRepository.findAll();
		System.out.println(list);
		//先过滤一级指标
		for(XyglIndicators xi:list){
			TreeTools treeDemo = new TreeTools();
			if(xi.getParentId()==null || xi.getParentId()==""){//组装过滤出根父级指标
				treeDemo.setId(xi.getId());
				treeDemo.setPid(xi.getParentId());
				treeDemo.setText(xi.getIndicName());
				listTree.add(treeDemo);	
			}
		}
		//然后再循环一遍，查找二级指标			
		for(int j=0;j<listTree.size();j++){
			TreeTools treeDemoP = listTree.get(j);
			for(int k=0;k<list.size();k++){
				if(listTree.get(j).getId().equals(list.get(k).getParentId())){
					TreeTools treeDemo2 = new TreeTools();
					treeDemo2.setId(list.get(k).getId());
					treeDemo2.setPid(list.get(k).getParentId());
					treeDemo2.setText(list.get(k).getIndicName());
					treeDemoP.getNodes().add(treeDemo2);
				}
			}
		}	
		
		return listTree;
}


	@Override
	public List<TreeTools> getTreeM(String model_id) {
		List<TreeTools> listTree = new ArrayList<>();
		List<XyglModeldetail> list = xyglModeldetailService.getMxData(model_id);
		System.out.println(list);
		//先过滤一级指标
		for(XyglModeldetail xm:list){
			TreeTools treeM = new TreeTools();
			if(xm.getParentIndicId()==null || xm.getParentIndicId()==""){//组装过滤出根父级指标
				treeM.setId(xm.getIndicateId());
				treeM.setPid(xm.getParentIndicId());
				treeM.setText(xm.getIndicateName());
				listTree.add(treeM);	
			}
		}
		//然后再循环一遍，查找二级指标			
		for(int j=0;j<listTree.size();j++){
			TreeTools treeP = listTree.get(j);
			for(int k=0;k<list.size();k++){
				if(listTree.get(j).getId().equals(list.get(k).getParentIndicId())){
					TreeTools treeDemo2 = new TreeTools();
					treeDemo2.setId(list.get(k).getIndicateId());
					treeDemo2.setPid(list.get(k).getParentIndicId());
					treeDemo2.setText(list.get(k).getIndicateName());
					treeP.getNodes().add(treeDemo2);
				}
			}
		}	
		
		return listTree;
	}

	public List<XyglModel> findXyglModel(){
		return xyglModelRepository.findXyglModel();
		
	}


	@Override
	public List<XyglModel> findXyglModelRisk() {
		return xyglModelRepository.findXyglModelRisk();
	}


	@Override
	public List<XyglModel> findXyglModelAll(String modelName) {
		return xyglModelRepository.findXyglModelAll(modelName);
	}


	@Override
	public List<XyglModel> findXyglModelRiskAll(String modelNameRisk) {
		return xyglModelRepository.findXyglModelRiskAll(modelNameRisk);
	}
}
