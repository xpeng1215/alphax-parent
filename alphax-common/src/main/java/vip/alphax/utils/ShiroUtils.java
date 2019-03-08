//package vip.alphax.utils;
//
//import com.ucmed.core.exception.BusinessException;
//import com.ucmed.modular.admin.entity.SysUser;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.session.Session;
//import org.apache.shiro.subject.Subject;
//
//public class ShiroUtils {
//
//    public static Subject getSubjct() {
//        return SecurityUtils.getSubject();
//    }
//
//    public static SysUser getUser() {
//        Object object = getSubjct().getPrincipal();
//        return (SysUser)object;
//    }
//
//    public static void updateUser(String hospitalId,String projectId) {
//        SysUser user = getUser();
//        user.setHospitalId(hospitalId);
//        user.setProjectId(projectId);
//    }
//
//    public static Long getUserId() {
//        return getUser().getUserId();
//    }
//
//    public static void logout() {
//        getSubjct().logout();
//    }
//
//    public static Session getSession() {
//        return SecurityUtils.getSubject().getSession();
//    }
//
//    public static void setSessionAttribute(Object key, Object value) {
//        getSession().setAttribute(key, value);
//    }
//
//    public static Object getSessionAttribute(Object key) {
//        return getSession().getAttribute(key);
//    }
//
//    public static String getKaptcha(String key) {
//        Object kaptcha = getSessionAttribute(key);
//        if(kaptcha == null){
//            throw new BusinessException(500,"验证码已失效");
//        }
//        getSession().removeAttribute(key);
//        return kaptcha.toString();
//    }
//}
