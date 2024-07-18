'''WELCOME TO PNHS(Python Notification Handling System)'''

#we import the module plyer used to send notifications
#time and datetime are used to terminate the program automatically
#random is used to randomise the logic behind the quiz
#pickle is used to access the binary file where all the quiz questions are stored

from plyer import notification
import time
import random
import datetime
import pickle
import gc



def inbuilt():

    try:

        print("")
        print("Welcome to the inbuilt notification menu!")
        print("The in-built notifications are")
        print("Computer-Quiz (Code: A1 )")
        print("Positive Affirmations(Code:A2)")
        print("")

        X = input("Please enter a Code No. of your choice:-")


        if X == "A1":


                def easy():

                    cong = ", Congratulations!"
                    msg = "Your total score is:"
                    L1 = [0,1,2,3,4,5,6,7,8,9]
                    counter = 0
                    index = 0
                    p = 1
                    temp = []
                    L3 = []
                    f = open("C:\\Users\\HP\\Desktop\\project\\questions1.dat","rb")

                    for i in range(0,11):

                        try:

                            L = pickle.load(f)
                            L3.append(L)

                        except EOFError:

                            f.close()
                            print("The Quiz Starts Now!")

                    L2 = random.sample(L1, 10)

                    for i in L3:

                        if index == 0 or index == 9:

                            temp_index = L2[index]
                            temp = L3[temp_index]

                        else:

                            temp_index = L2[index + 1]
                            temp = L3[temp_index]

                        Question = temp[0]
                        Answer = temp[1]
                        print("")
                        print("#",p,Question)

                        Input_Ans = input("Please enter your answer:")
                        

                        if Input_Ans.lower() == Answer.lower():

                            print("")
                            print("Your answer was Correct!")
                            counter += 1

                        else:

                            print("")
                            print("Your answer was Incorrect, Better Luck Next Time!")
                            print("The correct answer is:",Answer)
                                

                        
                        

                        if p >= 10:

                            str_counter = str(counter)
                            fin_msg = msg+''+str_counter+cong
                            print("")
                            titl = "Computer-Quiz(Easy)"
                            path = '‪C:\\Users\\HP\\Desktop\\img\\confetti.ico'

                            notification.notify(message = fin_msg,timeout = 10, title = titl )
                            

                        


                        index += 1
                        p += 1

                        gc.collect()




                def intermediate():

                    cong = ", Congratulations!"
                    msg = "Your total score is:"
                    L1 = [0,1,2,3,4,5,6,7,8,9]
                    counter = 0
                    index = 0
                    p = 1
                    temp = []
                    L3 = []
                    f = open("C:\\Users\\HP\\Desktop\\project\\questions.dat","rb")


                    for i in range(0,11):

                        try:

                            L = pickle.load(f)
                            L3.append(L)


                        except EOFError:

                            f.close()
                            print("")
                            print("The Quiz Starts Now!")


                    L2 = random.sample(L1, 10)


                    for i in L3:

                        if index == 0 or index == 9:

                            temp_index = L2[index]
                            temp = L3[temp_index]

                        else:

                            temp_index = L2[index + 1]
                            temp = L3[temp_index]


                        Question = temp[0]
                        Answer = temp[1]
                        print("")
                        print("#",p,Question)
                        Input_Ans = input("Please enter your answer:")
                        

                        if Input_Ans.lower() == Answer.lower():

                            print("")
                            print("Your answer was Correct!")
                            counter += 1

                        else:

                            print("")
                            print("Your answer was Incorrect, Better Luck Next Time!")
                            print("The correct answer is:",Answer)
                                

                        
                        

                        if p >= 10:

                            str_counter = str(counter)
                            fin_msg = msg+''+str_counter+cong
                            print("")
                            titl = "Computer-Quiz(Intermediate)"
                            path = '‪C:\\Users\\HP\\Desktop\\img\\confetti.ico'

                            notification.notify(message = fin_msg,timeout = 10, title = titl )



                        index += 1
                        p += 1
                    
                        gc.collect()


                uni = True

                while uni == True:

                    print("")
                    print("Welcome to the Computer-Quiz")
                    print("Pick a Difficulty Level")
                    print("Enter 111 for Easy")
                    print("Enter 222 for Intermediate")
                    print("")
                    choice = input("Enter a suitable choice:")


                    if choice == '111':

                        easy()
                        uni = False

                    elif choice == '222':

                        intermediate()
                        uni = False

                    else:

                        print("Please enter the designated values only")
                        
                    
                    
            
        elif X == 'A2':

            seconds = time.time()
            local_time = time.ctime(seconds)
            n,n1 = local_time[11:13], local_time[14:16]
            c,c1 = int(n), int(n1)
            curr_time = c*60 + c1
            a = 0
            
            L = ["Whatever it is you're seeking won't come in the form you're expecting. :― Haruki Marukami",
                 "Belief creates the actual fact. :— William James",'''You don’t always need a plan. Sometimes you
                  just need to breathe, trust, let go and see what happens. :— Mandy Hale''', '''Try to be a rainbow
                  in someone’s cloud. :— Maya Angelou''','''“Faith is love taking the form of aspiration.
                  :—William Ellery Channing''']

            x = random.randint(0,4)
            while a<=5:
                    notification.notify(title = "Positive Affirmations",message = L[x],
                                    timeout = 10)

                    time.sleep(120 )
                    second = time.time()
                    local_time = time.ctime(seconds)
                    f,f1 = local_time[11:13], local_time[14:16]
                    d,d1 = int(f), int(f1)
                    fin_time = d*60 + d1
                    a =  fin_time - curr_time

                    gc.collect()

                                              
        else:
            print("Please enter a valid Code.")
    except EOFError:
        print("Please enter the designated Codes only.")


def custom():
    try:
        print("")
        print("Welcome to the custom notification menu!")
        print('''In order to build your very own custom notification you need to enter a suitable Title,
                Message and a Timeout.''')
        print("")

        custm_title = input("Please enter a suitable Title for your custom notification:-")
        custm_message = input("Please enter a suitable Message for your custom notification:-")
        custm_timeout = int(input("Please enter a suitable Timeout for your custom notification:-"))
        custm_slp_timer= input('''Please enter a suitable time for the notification to appear again, Enter as
                                    Hour:Minutes:Seconds. For Example:- 02:30:45''')
        x,n,k = int(custm_slp_timer[0:2]), int(custm_slp_timer[3:5]), int(custm_slp_timer[6:]) 
        m,b = x*3600 , n*60
        slp_timer = m + b + k

        print("")
        print("If you want a custom app icon then enter '0'")
        print("If you want an inbuilt app icon then enter '1'")
        print("If you want an no app icon then enter '2'")
        print("")
        icon = input("Please enter your choice:-")

        if icon == "0" :

            seconds = time.time()
            local_time = time.ctime(seconds)
            n,n1 = local_time[11:13], local_time[14:16]
            c,c1 = int(n), int(n1)
            curr_time = c*60 + c1
            a = 0

            print("")
            icon_path = input("Please enter the suitable file path for your image:-")

            while a<= 5:
                notification.notify(title = custm_title,message = custm_message,
                            timeout = custm_timeout, app_icon = icon_path  )


                time.sleep(slp_timer)
                second = time.time()
                local_time = time.ctime(seconds)
                f,f1 = local_time[11:13], local_time[14:16]
                d,d1 = int(f), int(f1)
                fin_time = d*60 + d1
                a =  fin_time - curr_time

            gc.collect()
                
        elif icon == "1":

            seconds = time.time()
            local_time = time.ctime(seconds)
            n,n1 = local_time[11:13], local_time[14:16]
            c,c1 = int(n), int(n1)
            curr_time = c*60 + c1
            a = 0

            icon_path = "‪‪C:\\Users\\HP\\Desktop\\img\\bell.png"

            while a<= 5:

                notification.notify(title = custm_title,message = custm_message,
                            timeout = custm_timeout, app_icon = icon_path )


                time.sleep(slp_timer)
                second = time.time()
                local_time = time.ctime(seconds)
                f,f1 = local_time[11:13], local_time[14:16]
                d,d1 = int(f), int(f1)
                fin_time = d*60 + d1
                a =  fin_time - curr_time

            gc.collect()
            

        elif icon == "2":

            seconds = time.time()
            local_time = time.ctime(seconds)
            n,n1 = local_time[11:13], local_time[14:16]
            c,c1 = int(n), int(n1)
            curr_time = c*60 + c1
            a = 0

            while a<= 5:

                notification.notify(title = custm_title,message = custm_message,
                            timeout = custm_timeout
                                    )


                time.sleep(slp_timer)
                second = time.time()
                local_time = time.ctime(seconds)
                f,f1 = local_time[11:13], local_time[14:16]
                d,d1 = int(f), int(f1)
                fin_time = d*60 + d1
                a =  fin_time - curr_time

            gc.collect()

        else:
            print("Please enter a designated value only")
                            

    except ValueError:
        print("Please enter suitable data for the designated fields")




def exit_prog():

    print("")
    print("Thank you for using the Python Notification Handling System")
    x = int(input("Please leave a review on a scale of 1-10 on how useful this program was:-"))


    if x >= 7 :

        print("")
        print("Thank you for leaving a postive remark, we hope to see you again!")
        print("")
        print("Please help us to improve our program by leaving a remark for the same!")


        file = open("review.dat","ab")
        review = input("Please enter your review:")
        L = ["Review more than 7",review]
        pickle.dump(L,file)
        print("")
        print("Thank you for helping us improve, your feedback is greatly appreciated")


        file.close()


    elif x >= 5 and x < 7:

        print("")
        print("Thank You for using our program!")
        print("")
        print("Please help us to improve our program by leaving a remark for the same!")

        file = open("review.dat","ab")
        review = input("Please enter your review:")
        L = ["Review more than 5 and less than 7",review]
        pickle.dump(review,file)
        print("")
        print("Thank you for helping us improve, your feedback is greatly appreciated")

        file.close()


    else:

        print("")
        print("We apologize for an unpleasant experience, we would improve this program more!")
        print("")
        print("Please help us to improve our program by leaving a remark for the same!")

        file = open("review.dat","ab")
        review = input("Please enter a suitable review:")
        L = ["Review less than 5",review]
        pickle.dump(L,file)
        print("")
        print("Thank you for helping us improve, your feedback is greatly appreciated")

        file.close()

        gc.collect()





x = input("Enter the required password:")
passwd = "3xpire987$%"

if x == passwd:

    while True:

        print("")
        print("Hello and Welcome to Python Notification Handling System(PNHS)!")
        print(" 1.) If you would like to use an Inbuilt Notification then the Code is '11' ")
        print(" 2.) If you would like a Custom Notification then the Code is '22' ")
        print(" 3.) If you would like to Exit the program then the Code is '33' ")
        print("")

        choice = input("Please enter a Code your choice:-")

        if choice == '11':

            inbuilt()

        elif choice == '22':

            custom()

        elif choice == '33':

            exit_prog()
            break

        else:

            print("Please only enter the designated Codes only")

        gc.collect()


else:

    print("Incorrect password entered")