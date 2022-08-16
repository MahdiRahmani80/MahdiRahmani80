
class Resume(private val skill_list: List<String>, private val projs: List<Project>) {
    private val fullName = "Mehdi Rahmani"
    private val position = "Android Developer"
    private var phone = "+98-933-083-2676"
    private var email = "mahdirahmani8@yahoo.com"
    private val skills = skill_list
    private val projectList = projs

    fun me():String = "Name: $fullName \nPosition: $position"
    fun contact():String = "Phone $phone \nE-mail $email"
    fun getSkills():List<String> = skill_list
    fun getProjects(): List<Project> = projs
}
class Project(private val projName: String, private val description: String) {
    private val projectName = this.projName
    private val projectDescription = this.description
    
    fun getProjectName():String = projectName
}

fun main(){
    val myResume:Resume = Resume(getSkills(),getExperience())
    println(myResume.me())
    println("=====")
    println("\nSKILLS: \n${myResume.getSkills()} \n\n=======\nPROJECTS:")
    for (i in myResume.getProjects())
	println("${i.getProjectName()}")
    println("\n=====")
    println(myResume.contact())

}

fun getExperience(): List<Project> {
    val projs = ArrayList<Project>()
    projs.add(Project("Tech news","find newest tech news")) // find in : https://github.com/MahdiRahmani80/Tech-News
    projs.add(Project("WeblogAPP","this is weblog app")) // find in : https://github.com/MahdiRahmani80/WeblogApp
    projs.add(Project("LEM","Learn English with Music ")) // find in : https://github.com/MahdiRahmani80/LEM
    projs.add(Project("B00kApp","Story and audio book")) // find in : https://github.com/MahdiRahmani80/B00kApp
    return projs
}
fun getSkills(): List<String> {
    val skills = ArrayList<String>()
    skills.add("Java") ; skills.add("Kotlin") ; skills.add("Python") // programming languages
    skills.add("MVVM") ; skills.add("Retrofit, Glide, Material Design, ...")
    skills.add("XML")  ; skills.add("APIs") ; skills.add("Git") ; skills.add("Android Lifecycle")
    skills.add("Linux") ; skills.add("Django") ; skills.add("Figma") ;skills.add("Database (Sqlite)") ;
    return skills
}
