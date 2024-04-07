package com.sidharth.swaasth.common.constant

import com.sidharth.swaasth.common.enums.MedicalField
import com.sidharth.swaasth.domain.model.Speciality

object AppConstants {
    val demoBanners = listOf(
        "https://as1.ftcdn.net/v2/jpg/01/96/63/34/1000_F_196633449_esdLHOjO3QxrxVF8WWTRdDc501w1Xtm1.jpg",
        "https://img.freepik.com/free-vector/tiny-doctors-patients-near-hospital-flat-vector-illustration-therapist-face-mask-saying-goodbye-cured-people-near-medical-building-ambulance-emergency-clinic-concept_74855-25338.jpg",
        "https://static.vecteezy.com/system/resources/previews/004/493/193/original/hospital-building-for-healthcare-background-illustration-with-ambulance-car-doctor-patient-nurses-and-medical-clinic-exterior-vector.jpg"
    )

    val demoSpecialities = listOf(
        Speciality(MedicalField.CHIROPRACTOR, "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"),
        Speciality(MedicalField.BIOKINETICIST, "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"),
        Speciality(MedicalField.ATHLETIC_TRAINER, "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"),
        Speciality(MedicalField.YOGA_INSTRUCTOR, "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"),
        Speciality(MedicalField.MASSAGE_THERAPIST, "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"),
        Speciality(MedicalField.RADIOLOGIST, "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"),
        Speciality(MedicalField.RADIOLOGY_PHYSICIAN_ASSISTANT, "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"),
        Speciality(MedicalField.RADIOTHERAPIST, "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"),
        Speciality(MedicalField.RADIOGRAPHER, "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"),
        Speciality(MedicalField.CT_RADIOGRAPHER, "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png")
    )
}