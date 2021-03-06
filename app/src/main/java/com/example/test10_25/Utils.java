package com.example.test10_25;

import com.amap.api.location.AMapLocation;
import com.amap.api.maps.model.LatLng;

public class Utils {
	 final static int MSG_LOCATION_START = 0;

	public final static int MSG_LOCATION_FINISH = 1;

	public final static int MSG_LOCATION_STOP= 2;

	/**
	 * 根据定位结果返回定位信息的字符串
	 * @param loc
	 * @return
	 */
	public static	String City;

	public synchronized static String getLocationStr(AMapLocation location){
		City =location.getCity();
		if(null == location){
			return null;
		}
		StringBuffer sb = new StringBuffer();
		//errCode等于0代表定位成功，其他的为定位失败，具体的可以参照官网定位错误码说明
		if(location.getErrorCode() == 0){
			sb.append("定位成功" + "\n");
			sb.append("定位类型: " + location.getLocationType() + "\n");
			sb.append("经    度    : " + location.getLongitude() + "\n");
			sb.append("纬    度    : " + location.getLatitude() + "\n");
			sb.append("精    度    : " + location.getAccuracy() + "米" + "\n");
			sb.append("提供者    : " + location.getProvider() + "\n");

			if (location.getProvider().equalsIgnoreCase(
					android.location.LocationManager.GPS_PROVIDER)) {
				// 以下信息只有提供者是GPS时才会有
				sb.append("速    度    : " + location.getSpeed() + "米/秒" + "\n");
				sb.append("角    度    : " + location.getBearing() + "\n");
				// 获取当前提供定位服务的卫星个数
				sb.append("星    数    : "
						+ location.getSatellites() + "\n");
			} else {

				sb.append("国    家    : " + location.getCountry() + "\n");
				sb.append("省            : " + location.getProvince() + "\n");
				sb.append("市            : " + location.getCity() + "\n");
				sb.append("城市编码 : " + location.getCityCode() + "\n");
				sb.append("区            : " + location.getDistrict() + "\n");
				sb.append("区域 码   : " + location.getAdCode() + "\n");
				sb.append("地    址    : " + location.getAddress() + "\n");
				sb.append("兴趣点    : " + location.getPoiName() + "\n");
			}
		} else {

		}
		return sb.toString();
	}
	public synchronized static LatLng getLocationLatLng(AMapLocation location){
		//                    纬    度                经    度
		return new LatLng(location.getLatitude(),location.getLongitude());
	}

}
