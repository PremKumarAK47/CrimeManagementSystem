package dao;

import beans.CrimeInfo;
import beans.CriminalInfo;
import exception.CrimeException;
import exception.CriminalException;

public interface CrimeDao {
	
	public String registerCrime(CrimeInfo crm) throws CrimeException;
	
	public String registerCriminal(CriminalInfo criminalInfo) throws CriminalException;

}
