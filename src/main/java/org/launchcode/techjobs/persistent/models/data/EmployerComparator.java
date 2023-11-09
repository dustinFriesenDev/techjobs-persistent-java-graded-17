package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Employer;
import org.launchcode.techjobs.persistent.models.Job;

import java.util.Comparator;

public class EmployerComparator implements Comparator<Employer> {

    @Override
    public int compare(Employer a1, Employer a2) {
        return a1.getName().compareTo(a2.getName());
    }

}
