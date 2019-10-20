package cn.tianjin.unifiedfee.credit.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.taiji.db.jpa.base.service.BaseServiceImpl;
import cn.tianjin.unifiedfee.credit.domain.ParamTools;
import cn.tianjin.unifiedfee.credit.domain.XyglModeldetail;
import cn.tianjin.unifiedfee.credit.repository.XyglModeldetailRepository;
import cn.tianjin.unifiedfee.credit.service.XyglModeldetailService;

@Service
public class XyglModeldetailServiceImpl extends BaseServiceImpl<XyglModeldetail, String> implements XyglModeldetailService {
	@Autowired
	public XyglModeldetailRepository xyglModeldetailRepository;
	
	@Override
	public List<XyglModeldetail> addModel(ParamTools paramTools) {
		
		 List<XyglModeldetail> mdList = paramTools.getMdList();
		 String model_id = paramTools.getModel_id();		
		boolean flag = false;//是否保存
		List<XyglModeldetail> resList = new ArrayList<>();//保存的list
		List<XyglModeldetail> getList = xyglModeldetailRepository.getMxData(model_id);//查询表的list
		Map<String,Integer> refMap = new HashMap<String,Integer>();//保存的标记一下
		for(int v=0;v<getList.size();v++){
			refMap.put(getList.get(v).getIndicateId(), 1);
		}				
		for(int i=0;i<mdList.size();i++){
			flag = false;
			XyglModeldetail md = mdList.get(i);
			if(refMap.get(md.getIndicateId())==null){
				flag = true;
				for(int k=0;k<getList.size();k++){
					XyglModeldetail mdd = getList.get(k);
					if(md.getIndicateId().equals(mdd.getIndicateId())){
						//res.setCode(400);
						//res.setMsg("指标重复");
					}
				}
			};						
			if(flag){
				for(int n=0;n<resList.size();n++){
					XyglModeldetail xmds = resList.get(n);
					if(md.getIndicateId().equals(xmds.getIndicateId())){
						flag=false;
					}
				}
			}
			if(flag){
				resList.add(md);
			}			
		}				
		return 	xyglModeldetailRepository.saveAll(resList);
	}


	@Override
	public int delModel(String[] ids,String model_id) {
		List<XyglModeldetail> list1 = new ArrayList<>();
		List<String> str1 = Arrays.asList(ids);
		for(int i=0;i<str1.size();i++){
			XyglModeldetail xyglModeldetail =new XyglModeldetail();
			xyglModeldetail.setIndicateId(str1.get(i));
			list1.add(xyglModeldetail);
		}
		return xyglModeldetailRepository.delete(ids,model_id);
	}


	@Override
	public List<XyglModeldetail> findInforById(String sid) {
		System.out.println(xyglModeldetailRepository.findInforById(sid));
		return xyglModeldetailRepository.findInforById(sid);
	}


	@Override
	public int updatab(String inputValue) {
		String[] aString = inputValue.split("&");
		String aString2 = aString[0];	//权重	
		String aString3 = aString[1];	//指标id
		String aString4 = aString3.split("=")[1];//获取指标id
		String aString5 = aString2.split("=")[1];//权重数据
		return xyglModeldetailRepository.updatab(aString4,aString5);
	}


	@Override
	public List<XyglModeldetail> findIdByIndicId(String id) {
		return xyglModeldetailRepository.findIdByIndicId(id);
	}


	@Override
	public List<Object[]> findInformationByid(String aid) {
		return xyglModeldetailRepository.findInformationByid(aid);
	}


	@Override
	public Integer updateData(String updateData) {
		String[] aStrings = updateData.split("&");
		String paramentA = aStrings[0];//paramentA
		String paramentB = aStrings[1];//paramentB
		String xminvalue = aStrings[2];//xminvalue
		String xmaxvalue = aStrings[3];//xmaxvalue
		String zhibiaoID = aStrings[4];//指标值公式ID
		//根据=拆分，获取右边信息
		String aparamentA = paramentA.split("=")[1];
		String aparamentB = paramentB.split("=")[1];
		String axminvalue = xminvalue.split("=")[1];
		String axmaxvalue = xmaxvalue.split("=")[1];
		String azhibiaoID = zhibiaoID.split("=")[1];
		return xyglModeldetailRepository.updateData(aparamentA, aparamentB, axminvalue, axmaxvalue, azhibiaoID);
	}


	@Override
	public List<XyglModeldetail> getMxData(String model_id) {
		return xyglModeldetailRepository.getMxData(model_id);
	}


	public static String a(){//id自增
       // 创建 Calendar 对象  
       Calendar calendar = Calendar.getInstance();  
       // 设置传入的时间格式
       SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-ddHHmmssSSS");  
       // get到当前年份,需要完整时间则将“yyyy”改成“yyyy-MM-dd HH:mm:ss:SSS”
       String strYear = simpledateformat.format(calendar.getTime());  
       //截取用户id最后六位字符，UMI=“000011”
       String UMI="CE2017000011".substring(7, 12);
       //将之转换成数字，+1后再转成字符串，num="12"
       String num=""+(Integer.parseInt(UMI)+1);
       //获取数字前所需0的个数
       int lenZero=6-num.length();
       //将相应个数的0添加到字符串中，num="000012"
       for(int i=0;i<lenZero;i++)
           num="0"+num;
       //将新的用户id标记年份以及数字拼接起来，userId=“CE2017000012”
       String userId="CE"+strYear+num;
       System.out.println(userId);
		return userId;
	}
	@Override
	public Integer insertData(String insertData) {
		String[] aStrings = insertData.split("&");
		String paramentA = aStrings[0];//paramentA
		String paramentB = aStrings[1];//paramentB
		String xminvalue = aStrings[2];//xminvalue
		String xmaxvalue = aStrings[3];//xmaxvalue
//		String zhibiaoID = aStrings[4];//指标值公式ID
		String dataId = aStrings[4];
		//根据=拆分，获取右边信息
		String aparamentA = paramentA.split("=")[1];
		String aparamentB = paramentB.split("=")[1];
		String axminvalue = xminvalue.split("=")[1];
		String axmaxvalue = xmaxvalue.split("=")[1];
//		String azhibiaoID = zhibiaoID.split("=")[1];
		String adataId = dataId.split("=")[1];
		String growthId = a();
		return xyglModeldetailRepository.insertData(aparamentA, aparamentB, axminvalue, axmaxvalue,growthId,adataId);
	}






}
