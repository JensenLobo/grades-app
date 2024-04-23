package edu.uncc.gradesapp.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CourseReview {
    String courseId;
    ArrayList<String> likeUids = new ArrayList<>();
    int reviewCount = 0;

    public CourseReview() {
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public ArrayList<String> getLikeUids() {
        return likeUids;
    }

    public void setLikeUids(ArrayList<String> likeUids) {
        this.likeUids = likeUids;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }
}
