package com.sidharth.swaasth.common.constant

import com.sidharth.swaasth.common.constant.DemoConstants.demoDoctors
import com.sidharth.swaasth.common.constant.DemoConstants.doctorImages
import com.sidharth.swaasth.common.constant.DemoConstants.firstNames
import com.sidharth.swaasth.common.constant.DemoConstants.lastNames
import com.sidharth.swaasth.common.constant.DemoConstants.notificationMessages
import com.sidharth.swaasth.common.enums.Gender
import com.sidharth.swaasth.common.enums.MedicalField
import com.sidharth.swaasth.domain.model.Appointment
import com.sidharth.swaasth.domain.model.Doctor
import com.sidharth.swaasth.domain.model.Notification
import com.sidharth.swaasth.domain.model.Patient
import com.sidharth.swaasth.domain.model.Speciality
import com.sidharth.swaasth.domain.model.User
import kotlin.random.Random

object DemoConstants {
    val demoBanners = listOf(
        "https://as1.ftcdn.net/v2/jpg/01/96/63/34/1000_F_196633449_esdLHOjO3QxrxVF8WWTRdDc501w1Xtm1.jpg",
        "https://img.freepik.com/free-vector/tiny-doctors-patients-near-hospital-flat-vector-illustration-therapist-face-mask-saying-goodbye-cured-people-near-medical-building-ambulance-emergency-clinic-concept_74855-25338.jpg",
        "https://static.vecteezy.com/system/resources/previews/004/493/193/original/hospital-building-for-healthcare-background-illustration-with-ambulance-car-doctor-patient-nurses-and-medical-clinic-exterior-vector.jpg"
    )

    val demoSpecialities = listOf(
        Speciality(
            MedicalField.CHIROPRACTOR,
            "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"
        ),
        Speciality(
            MedicalField.BIOKINETICIST,
            "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"
        ),
        Speciality(
            MedicalField.ATHLETIC_TRAINER,
            "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"
        ),
        Speciality(
            MedicalField.YOGA_INSTRUCTOR,
            "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"
        ),
        Speciality(
            MedicalField.MASSAGE_THERAPIST,
            "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"
        ),
        Speciality(
            MedicalField.RADIOLOGIST,
            "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"
        ),
        Speciality(
            MedicalField.RADIOLOGY_PHYSICIAN_ASSISTANT,
            "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"
        ),
        Speciality(
            MedicalField.RADIOTHERAPIST,
            "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"
        ),
        Speciality(
            MedicalField.RADIOGRAPHER,
            "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"
        ),
        Speciality(
            MedicalField.CT_RADIOGRAPHER,
            "https://static.vecteezy.com/system/resources/previews/028/860/787/original/statoscope-medical-3d-icon-png.png"
        )
    )

    val firstNames = listOf(
        "Aarav",
        "Aaradhya",
        "Aashish",
        "Abha",
        "Abhay",
        "Aditi",
        "Aditya",
        "Advait",
        "Akanksha",
        "Akhil",
        "Akshara",
        "Akshay",
        "Alia",
        "Alok",
        "Amit",
        "Amita",
        "Amrita",
        "Anand",
        "Ananya",
        "Aniket",
        "Anisha",
        "Anuj",
        "Anupam",
        "Apoorva",
        "Arjun",
        "Arpita",
        "Arvind",
        "Ashok",
        "Avinash",
        "Ayush",
        "Bhavana",
        "Bhuvan",
        "Chaitanya",
        "Charu",
        "Chetan",
        "Deepti",
        "Dev",
        "Dhruv",
        "Divya",
        "Gaurav",
        "Geeta",
        "Girish",
        "Hari",
        "Harsha",
        "Ishaan",
        "Jagdish",
        "Jaya",
        "Kamal",
        "Kavita",
        "Kishan",
        "Krishna",
        "Lakshmi",
        "Madhav",
        "Mahesh",
        "Manisha",
        "Mayank",
        "Meera",
        "Mohan",
        "Mukesh",
        "Neha",
        "Nikhil",
        "Nirav",
        "Pankaj",
        "Parul",
        "Pranav",
        "Prachi",
        "Pradeep",
        "Pramod",
        "Pranita",
        "Preeti",
        "Rahul",
        "Raj",
        "Rajesh",
        "Ramesh",
        "Rashmi",
        "Ravi",
        "Rohan",
        "Rohit",
        "Sachin",
        "Sameer",
        "Sanjay",
        "Santosh",
        "Sarita",
        "Saurabh",
        "Shalini",
        "Shashi",
        "Shikha",
        "Shilpa",
        "Shiva",
        "Shraddha",
        "Shreyas",
        "Shubham",
        "Siddharth",
        "Sneha",
        "Sonal",
        "Sudeep",
        "Sumit",
        "Sunita",
        "Sunil",
        "Suresh",
        "Swapnil",
        "Swati",
        "Tanya",
        "Tanvi",
        "Tarun",
        "Uday",
        "Uma",
        "Vaibhav",
        "Vidya",
        "Vikram",
        "Vimal",
        "Vinita",
        "Vivek",
        "Yogesh"
    )

    val lastNames = listOf(
        "Agarwal",
        "Ahuja",
        "Bajaj",
        "Bansal",
        "Batra",
        "Chadha",
        "Chandra",
        "Chopra",
        "Das",
        "Dutta",
        "Gupta",
        "Jain",
        "Jha",
        "Kapoor",
        "Khanna",
        "Kumar",
        "Mahajan",
        "Malhotra",
        "Mehta",
        "Mishra",
        "Mohanty",
        "Patel",
        "Pillai",
        "Prasad",
        "Rao",
        "Rastogi",
        "Reddy",
        "Seth",
        "Shah",
        "Sharma",
        "Singh",
        "Sinha",
        "Srivastava",
        "Thakur",
        "Trivedi",
        "Varma",
        "Verma"
    )

    val doctorImages = listOf(
        "https://img.freepik.com/free-photo/beautiful-young-female-doctor-looking-camera-office_1301-7807.jpg",
        "https://img.freepik.com/free-photo/female-doctor-hospital-with-stethoscope_23-2148827776.jpg",
        "https://img.freepik.com/premium-photo/portrait-smiling-doctor-white-uniform-standing-with-crossed-hands-grey-background_168410-1747.jpg",
        "https://thumbs.dreamstime.com/b/sexy-sensual-blonde-woman-beautiful-girl-spring-romantic-casual-woman-portrait-beautiful-girl-outdoor-close-up-sexy-sensual-blonde-242365361.jpg",
        "https://c4.wallpaperflare.com/wallpaper/810/440/905/hot-girl-hd-1920x1200-wallpaper-preview.jpg",
        "https://c8.alamy.com/zooms/9/d52391dcf89a4749b4b9cd160792e88d/gd4wmf.jpg",
        "https://t3.ftcdn.net/jpg/05/87/35/38/360_F_587353890_dEdFmxwUWJNtYo5nOh2rLd8uelv75LMT.jpg",
        "https://img.freepik.com/premium-photo/indian-medical-students-smiling-giving-happy-expression_130568-403.jpg",
        "https://img.freepik.com/premium-photo/indian-medical-student-group-smiling-giving-happy-expression_130568-401.jpg",
        "https://t3.ftcdn.net/jpg/02/79/63/30/360_F_279633092_quePrl3OjoTbJi4tYy62BSko7zB8QO36.jpg"
    )

    val notificationMessages = listOf(
        "Appointment scheduled successfully.",
        "Your order has been placed successfully.",
        "Password reset link sent to your email.",
        "Profile updated successfully.",
        "New message received from support.",
        "Your subscription has been renewed.",
        "Welcome to our community!",
        "Reminder: Your appointment is tomorrow.",
        "Congratulations! You've reached a new milestone.",
        "Thank you for your feedback. We'll address the issue promptly."
    )

    val demoDoctors by lazy { generateRandomDoctors(Random.nextInt(10, 20)) }

    val demoPatients by lazy { generatePatients() }

    val appointments by lazy { generateAppointments() }

    val demoNotifications by lazy { generateNotifications() }

    val demoUser by lazy {
        User(
            id = Random.nextDouble().toString(),
            name = "${firstNames.random()} ${lastNames.random()}",
            phone = "9638772639",
            email = "${firstNames.random()}@gmail.com",
            sex = Gender.entries.random(),
            dob = System.currentTimeMillis() - 1000 * 60L * 60 * 24 * 30 * 12 * (Random.nextInt(18,40)),
            image = doctorImages.random()
        )
    }
}

private fun getRandomTimestamp(future: Int = 1): Long {
    val currentTime = System.currentTimeMillis()
    val fifteenDaysInMillis = 1000 * 60 * 60 * 24 * 15L
    return currentTime - fifteenDaysInMillis + Random.nextLong(0, fifteenDaysInMillis * 2) * future
}

private fun generateNotifications(): List<Notification> {
    val notifications = mutableListOf<Notification>()

    repeat(10) {
        notifications.add(
            Notification(
                id = "$it",
                message = notificationMessages.random(),
                timestamp = getRandomTimestamp(0)
            )
        )
    }

    return notifications
}

private fun generateAppointments(): List<Appointment> {
    val appointments = mutableListOf<Appointment>()

    val availableTimeslots = listOf("Morning", "Afternoon", "Evening")

    repeat(20) {
        appointments.add(
            Appointment(
                timeslot = availableTimeslots.random(),
                timestamp = getRandomTimestamp(),
                doctor = demoDoctors.random()
            )
        )
    }

    return appointments
}

private fun generatePatients(): List<Patient> {
    val patients = mutableListOf<Patient>()

    repeat(5) {
        patients.add(
            Patient(
                id = "1",
                name = "${firstNames.random()} ${lastNames.random()}",
                status = "ETA ${Random.nextInt(5, 31)}min"
            )
        )
    }

    repeat(5) {
        patients.add(
            Patient(
                id = "0",
                name = "${firstNames.random()} ${lastNames.random()}",
                status = "In Clinic"
            )
        )
    }

    return patients
}

private fun generateRandomDoctors(count: Int): List<Doctor> {
    val hospitals = listOf(
        "ABC Hospital, XYZ Nagar",
        "PQR Medical Center, LMN Road",
        "EFG Clinic, ABC Street",
        "GHI Hospital, QRS Colony",
        "JKL Medical Center, MNO Avenue"
    )

    val doctors = mutableListOf<Doctor>()

    for (i in 1..count) {
        val availableDaysOfMonth = mutableListOf<Long>().apply {
            repeat(30) {
                if  (Random.nextBoolean()) {
                    val timestamp = 1000 * 60L * 60 * 24 * it
                    add(timestamp)
                }
            }
        }

        val availableTimeRange = mutableListOf<Pair<String, String>>()
        for (day in availableDaysOfMonth) {
            val startTime = String.format("%02d:%02d", Random.nextInt(0, 24), Random.nextInt(0, 60))
            val endTime = String.format("%02d:%02d", Random.nextInt(0, 24), Random.nextInt(0, 60))
            availableTimeRange.add(startTime to endTime)
        }

        val doctor = Doctor(
            id = "DOC${i.toString().padStart(3, '0')}",
            name = "${firstNames.random()} ${lastNames.random()}",
            image = doctorImages.random(),
            about = "Has Extensive Scientific Knowledge: Good dental surgeon should have a wealth of knowledge about teeth and oral hygiene. They are able to quickly identify problems as well as their most effective treatments.",
            workplace = hospitals.random(),
            gender = if (Random.nextBoolean()) "Male" else "Female",
            speciality = MedicalField.entries.toTypedArray().random(),
            experience = Random.nextInt(1, 41),
            patientsCount = Random.nextInt(0, 1000),
            rating = Random.nextDouble(1.0, 5.0),
            appointmentDuration = Random.nextInt(15, 61),
            availableDaysOfMonth = availableDaysOfMonth,
            availableTimeRange = availableTimeRange,
            reviews = notificationMessages.subList(0, Random.nextInt(notificationMessages.size))
        )
        doctors.add(doctor)
    }

    return doctors
}