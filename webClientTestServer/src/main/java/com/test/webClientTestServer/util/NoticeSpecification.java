package com.test.webClientTestServer.util;

//public class NoticeSpecification {
//
//    public static Specification<Notice> defaultWhere() {
//        return (root, query, cb) -> cb.isTrue(cb.literal(true));
//    }
//
//    public static Specification<Notice> likeTitle(String noticeTitle) {
//        return (root, query, cb) -> cb.like(root.get("noticeTitle"), "%" + noticeTitle + "%");
//    }
//
//    public static Specification<Notice> likeContent(String noticeContent) {
//        return (root, query, cb) -> cb.like(root.get("noticeContent"), "%" + noticeContent + "%");
//    }
//
//    public static Specification<Notice> betweenDateTime(Timestamp startDatetime, Timestamp endDatetime) {
//        return (root, query, cb) -> {
//            if(startDatetime == null) {
//                return cb.lessThanOrEqualTo(root.get("insertDt"), endDatetime);
//            } else if(endDatetime == null) {
//                return cb.greaterThanOrEqualTo(root.get("insertDt"), startDatetime);
//            } else {
//                return cb.between(root.get("insertDt"), startDatetime, endDatetime);
//            }
//        };
//    }
//}