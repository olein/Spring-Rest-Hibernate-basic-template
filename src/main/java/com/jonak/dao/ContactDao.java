/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonak.dao;

import com.jonak.entity.Contact;
import java.io.Serializable;
import java.util.List;
/**
 *
 * @author Fahim Fahad
 */
public interface ContactDao extends GenericDao<Contact, Integer> {
    
    public List<Contact> getUserByID(int id);
}
