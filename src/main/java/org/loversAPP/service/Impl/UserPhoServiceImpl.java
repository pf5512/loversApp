package org.loversAPP.service.Impl;

import org.loversAPP.DTO.UserPhoto;
import org.loversAPP.dao.PhotoRecordsMapper;
import org.loversAPP.model.PhotoRecords;
import org.loversAPP.service.UserPhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/3/13.
 */
@Service
public class UserPhoServiceImpl implements UserPhoService {
    @Autowired
    private PhotoRecordsMapper photoRecordsMapper;

    public Integer insertPhoto(Integer recordsID, Integer userID, String photo, String content, String longtitude, String latitude) {
        PhotoRecords photoRecords=new PhotoRecords();
        photoRecords.setRecordsid(recordsID);
        photoRecords.setUserid(userID);
        photoRecords.setPhoto(photo);
        photoRecords.setPublishdate(new Date());
        photoRecords.setContent(content);
        photoRecords.setLongtitude(longtitude);
        photoRecords.setLatitude(latitude);
        return photoRecordsMapper.insert(photoRecords);
    }


    public List<UserPhoto> getPhotosByUserID(Integer userid) {
        return photoRecordsMapper.getPhotosByUserID(userid);
    }


    public List<UserPhoto> getPhotosByRecordsID(Integer recoiD) {
        return photoRecordsMapper.getPhotosByRecordsID(recoiD);
    }
    public Integer deletePhotoByID(Integer id) {
        return photoRecordsMapper.deleteByPrimaryKey(id);
    }


    public int deletePhotoByID(int id) {
        return photoRecordsMapper.deleteByPrimaryKey(id);
    }

    public List<PhotoRecords> getOuterUserPhotosByUseriD() {
        return photoRecordsMapper.getOuterUserPhotosByUseriD();
    }

    public List<UserPhoto> getPhotosExceptOne(Integer userID) {
        return photoRecordsMapper.getPhotosExceptOne(userID);
    }

    public UserPhoto getUserPhotoByPhotoID(int photoID) {
        return photoRecordsMapper.getUserPhotoByPhotoID(photoID);
    }

    public int getUserIDbyPhoid(int phoID) {
        return photoRecordsMapper.getUserIDbyPhoid(phoID);
    }

    public int updateUserPhoUrlByUserID(int trueUserid,String photo) {
        return photoRecordsMapper.updateUserPhoUrlByUserID(trueUserid,photo);
    }
}
